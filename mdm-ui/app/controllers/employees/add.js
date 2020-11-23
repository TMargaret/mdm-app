import Controller, { inject as controller} from '@ember/controller';
import $ from "jquery";
import { action } from '@ember/object';
import { alias } from '@ember/object/computed';

export default class EmployeesAddController extends Controller {

  @controller employees;
  @alias('employees.company') company;
  queryParams = ['company'];

  @action
  addEmployee(employee) {
    console.log(employee)
    console.log(this.company)
    employee.companyName = this.company;
    // $.getJSON({
    //   type: 'POST',
    //   url: "/employees/employee",
    //   data: JSON.stringify(employee),
    //   contentType: "application/json",
    //   dataType: "json",
    // }).then(() => {
    //   this.transitionToRoute('employees')
    // })
  }
}
