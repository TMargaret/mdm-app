package com.assignment.mdm.repository;

import com.assignment.mdm.exception.DoesNotExistException;
import com.assignment.mdm.exception.ValueIsRequiredException;
import com.assignment.mdm.model.QBaseModel;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;


@Repository
public interface BaseRepository<T extends QBaseModel, I extends Serializable>
        extends JpaRepository<T, I>, QuerydslPredicateExecutor<T> {

    @NonNull
    List<T> findAll(@NonNull Predicate predicate);

    @NonNull
    List<T> findAll(@NonNull Predicate predicate, @NonNull Sort sort);

    default T fetchById(I id) {
        if (id == null) {
            throw new ValueIsRequiredException("Id is required to fetch an entity.");
        }
        Optional<T> optional = findById(id);

        return optional.orElseThrow(
                () -> new DoesNotExistException(MessageFormat
                        .format("Entity with id {0} could not be found.", id)));
    }

}
