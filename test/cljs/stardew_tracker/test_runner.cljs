(ns stardew-tracker.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [stardew-tracker.core-test]
   [stardew-tracker.common-test]))

(enable-console-print!)

(doo-tests 'stardew-tracker.core-test
           'stardew-tracker.common-test)
