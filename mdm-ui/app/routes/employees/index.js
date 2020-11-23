import Route from '@ember/routing/route';
import $ from 'jquery';
import { inject as service } from '@ember/service';

export default class EmployeesIndexRoute extends Route {

  @service store;

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
