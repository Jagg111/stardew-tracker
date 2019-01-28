(ns stardew-tracker.state
  (:require [reagent.core :as r]))

;; The values in this atom refer to the ":bundles :id" in the items game data
(def progress (r/atom #{0}))

;; The values in this atom refer to what is being searched for
(def searchText (r/atom ""))