import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Route | employees/add', function(hooks) {
  setupTest(hooks);

  test('it exists', function(assert) {
    let route = this.owner.lookup('route:employees/add');
    assert.ok(route);
  });
});
