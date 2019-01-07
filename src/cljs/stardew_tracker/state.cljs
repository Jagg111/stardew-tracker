(ns stardew-tracker.state
  (:require [reagent.core :as r]))

;; The values in this atom refer to the ":bundles :id" in the items game data
(def progress (r/atom #{}))