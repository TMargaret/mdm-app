import Route from '@ember/routing/route';
import $ from "jquery";

export default class EmployeesViewRoute extends Route {
  async model(params) {
    return $.getJSON("/employees/employee/" + params.employeeId).then(data => {
      return data;
    });
  }
}
