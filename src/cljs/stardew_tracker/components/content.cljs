(ns stardew-tracker.components.content
  (:require [stardew-tracker.state :as state]))

(defn content []
  [:main
   [:div.items
    (for [{:keys [id name source]} (vals @state/items)]
      [:div.item (:key id)
       [:p name]
       [:p source]])]])
