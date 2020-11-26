import Route from '@ember/routing/route';
import $ from 'jquery';

export default class EmployeesIndexRoute extends Route {

  queryParams = {
    company: {
      refreshModel: true
    }
  };

  async model(params) {
    if (params.company) {
      return $.getJSON("/employees/" + params.company).then(data => {
        return data
      });
    }
  }

}
