package com.assignment.mdm.mapper;

import com.assignment.mdm.DTO.EmployeeDTO;
import com.assignment.mdm.model.Employee;
import com.assignment.mdm.model.QBaseModel;
import org.mapstruct.MappingTarget;

import java.util.Date;
import java.util.List;

public interface BaseMapper<E extends QBaseModel, D> {

    /**
     * Maps an entity to a DTO.
     *
     * @param entity the source entity
     * @return the mapped DTO
     */
    D mapToDTO(E entity);

    /**
     * Maps a list of entities to a list of DTO's.
     *
     * @param entity the source entities list
     * @return the mapped list of DTO's
     */
    List<D> mapToDTO(List<E> entity);

    /**
     * Maps a DTO to an entity.
     *
     * @param dto the source DTO
     * @return the mapped entity
     */
    E mapToEntity(D dto);

    /**
     * Maps a list of DTO's to a list of entities.
     *
     * @param dto the source DTO's list
     * @return the mapped list of entities
     */
    List<E> mapToEntity(List<D> dto);

    /**
     * Maps a dto to an existed entity.
     *
     * @param dto the source DTO
     * @param entity the source entity
     */
    void mapToExistingEntity(D dto, @MappingTarget E entity);

    /**
     * Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this
     * <tt>Date</tt> object or null if value is null.
     *
     * @param value a {@link java.util.Date} value
     * @return a {@link java.lang.Long} representation of a date
     */
    default java.lang.Long map(java.util.Date value) {
        return (value != null) ? value.getTime() : null;
    }

    /**
     * Returns a {@link java.util.Date} object representing the {@link java.lang.Long} value of time in milliseconds or
     * null if value is null.
     *
     * @param value the number of milliseconds since January 1, 1970, 00:00:00 GMT
     * @return a {@link java.util.Date}
     */
    default java.util.Date mapToDTO(java.lang.Long value) {
        return (value != null) ? new Date(value) : null;
    }
}
