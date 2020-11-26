import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Controller | employees/view/index', function(hooks) {
  setupTest(hooks);

  // TODO: Replace this with your real tests.
  test('it exists', function(assert) {
    let controller = this.owner.lookup('controller:employees/view/index');
    assert.ok(controller);
  });
});
