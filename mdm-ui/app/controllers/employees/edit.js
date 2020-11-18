import Controller from '@ember/controller';
import $ from "jquery";
import { action } from '@ember/object';

export default class EmployeesEditController extends Controller {

  columns = [
    { name: 'Id', valuePath: 'id' },
    { name: 'Name', valuePath: 'name' },
    { name: 'Serial Number', valuePath: 'serialNumber' },
    { name: 'Type', valuePath: 'type'},
    { name: '', valuePath: 'delete'},
  ];

  sorts = [
    {
      valuePath: 'name',
      isAscending: false,
    },
    {
      valuePath: 'price',
      isAscending: true,
    },
  ]

  @action
  saveEmployee(employee) {
    console.log(this.get('name'))
    $.ajax({
      type: 'POST',
      url: "/employees/employee",
      data: JSON.stringify(employee),
      contentType: "application/json",
      dataType: "json",
      success: function(resultData) { alert("Save Complete") },
      error: function(response) {
        console.log(response);
      }
    });
  }
}
