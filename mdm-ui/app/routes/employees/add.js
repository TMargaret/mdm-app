import Route from '@ember/routing/route';
import { action } from '@ember/object';
import $ from "jquery";

export default class EmployeesAddRoute extends Route {

  @action
  addEmployee() {
    let employee =  {
      name: this.controller.get('name'),
      email: this.controller.get('email'),
      companyName: this.controller.get('company')
    };
    $.getJSON({
      type: 'POST',
      url: "/employees/employee",
      data: JSON.stringify(employee),
      contentType: "application/json",
      dataType: "json",
    }).then(() => {
      this.transitionTo('employees', {queryParams: {company: this.controller.get('company')}})
    })
  }
}
