import RESTAdapter from '@ember-data/adapter/rest';

export default class EmployeeAdapter extends RESTAdapter {
  namespace = 'employees';
}
