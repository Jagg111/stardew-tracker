(ns stardew-tracker.state
  (:require [reagent.core :as r]))

;; The values in this atom refer to the ":bundles :id" in the items atom below
(def progress (r/atom
                #{0}))

;;separate out everything below into a data file since these will never change. no need to use atoms
;; Items game data
(def items (r/atom
             {:item-01
              {:name "Wild Horseradish"
               :skills ["foraging"]
               :seasons ["spring"]
               :id 0
               :source "Foraging during Spring."
               :bundles {:bundle_id 0
                         :count 1
                         :id 0}}
              :item-02
              {:name "Daffodil"
               :skills ["foraging"]
               :seasons ["spring"]
               :id 1
               :source "Foraging during Spring. Buy from Pierre's Shop at the Flower Dance."
               :bundles {:bundle_id 0
                         :count 1
                         :id 1}}
              :item-03
              {:name "Leek"
               :skills ["foraging"]
               :seasons ["spring"]
               :id 2
               :source "Foraging during Spring."
               :bundles {:bundle_id 0
                         :count 1
                         :id 2}}
              :item-04
              {:name "Dandelion"
               :skills ["foraging"]
               :seasons ["spring"]
               :id 3
               :source "Foraging during Spring. Buy from Pierre's Shop at the Flower Dance"
               :bundles {:bundle_id 0
                         :count 1
                         :id 3}}}))

;; Seasons game data
(def seasons (r/atom {{:id "spring"
                       :order 0
                       :name "Spring"}
                      {:id "summer"
                       :order 1
                       :name "Summer"}
                      {:id "fall"
                       :order 2
                       :name "Fall"}
                      {:id "winter"
                       :order 3
                       :name "Winter"}}))

;; Rooms game data
(def rooms (r/atom [{:id 0
                     :name "Crafts Room"
                     :reward "Bridge Repair"}]))

;; Bundles game data
(def bundles (r/atom {
                      0
                      {:id 0
                       :name "Spring Foraging Bundle"
                       :room 0
                       :reward "Spring Seeds (30)"
                       :items_required 4}
                      1
                      {:id 1
                       :name "Summer Foraging Bundle"
                       :room 0
                       :reward "Summer Seeds (30)"
                       :items_required 3}}))