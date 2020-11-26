import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Route | employees/view/add', function(hooks) {
  setupTest(hooks);

  test('it exists', function(assert) {
    let route = this.owner.lookup('route:employees/view/add');
    assert.ok(route);
  });
});
