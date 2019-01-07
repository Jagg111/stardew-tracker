(ns stardew-tracker.data)
;; This holds all the static game data

;; Items game data
(def items {:item-01
            {:name "Wild Horseradish"
             :skills ["foraging"]
             :seasons ["spring"]
             :id 0
             :source "Foraging during Spring."
             :bundles [{:bundle_id 0
                        :count 1
                        :id 0}]}
            :item-02
            {:name "Daffodil"
             :skills ["foraging"]
             :seasons ["spring"]
             :id 1
             :source "Foraging during Spring. Buy from Pierre's Shop at the Flower Dance."
             :bundles [{:bundle_id 0
                        :count 1
                        :id 1}]}
            :item-03
            {:name "Leek"
             :skills ["foraging"]
             :seasons ["spring"]
             :id 2
             :source "Foraging during Spring."
             :bundles [{:bundle_id 0
                        :count 1
                        :id 2}]}
            :item-04
            {:name "Dandelion"
             :skills ["foraging"]
             :seasons ["spring"]
             :id 3
             :source "Foraging during Spring. Buy from Pierre's Shop at the Flower Dance"
             :bundles [{:bundle_id 0
                        :count 1
                        :id 3}]}
            :item-05
            {:name "Eel"
             :skills ["fishing"]
             :seasons ["Spring" "Fall"]
             :id 4
             :source "Found in the Ocean, Nighttime, Spring or Fall. Only when raining."
             :bundles [{:bundle_id 1
                        :count 1
                        :id 4}]}
            :item-06
            {:name "Clam"
             :skills ["Foraging" "Fishing"]
             :seasons ["Spring" "Summer" "Fall" "Winter"]
             :id 5
             :source "Found in the Ocean, Nighttime, Spring or Fall. Only when raining."
             :bundles [{:bundle_id 2
                        :count 1
                        :id 5}]}
            :item-07
            {:name "Apple"
             :skills ["Farming"]
             :seasons [ "Fall"]
             :id 6
             :source "Gathered from Apple Trees during Fall. Fodder Bundle requires 3."
             :bundles [{:bundle_id 3
                        :count 1
                        :id 6}
                       {:bundle_id 4
                        :count 3
                        :id 7}]}})


;; Seasons game data
(def seasons {{:id "spring"
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
               :name "Winter"}})

;; Rooms game data
(def rooms [{:id 0
             :name "Crafts Room"
             :reward "Bridge Repair"}])

;; Bundles game data
(def bundles {0
              {:id 0
               :name "Spring Foraging Bundle"
               :room 0
               :reward "Spring Seeds (30)"
               :items_required 4}
              1
              {:id 1
               :name "Night Fishing Bundle"
               :room 0
               :reward "Small Glow Ring"
               :items_required 3}
              2
              {:id 2
               :name "Crab Pot Bundle"
               :room 0
               :reward "placeholder"
               :items_required 3}
              3
              {:id 3
               :name "Artisan Bundle"
               :room 0
               :reward "placeholder"
               :items_required 3}
              4
              {:id 4
               :name "Fodder Bundle"
               :room 0
               :reward "placeholder"
               :items_required 3}})