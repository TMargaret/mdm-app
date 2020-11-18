import Route from '@ember/routing/route';
import $ from "jquery";

export default class EmployeesEditRoute extends Route {
  async model(params) {
    return $.getJSON("/employees/" + params.employeeId).then(data => {
      return data;
    });
  }
}
