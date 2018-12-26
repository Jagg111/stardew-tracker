(ns stardew-tracker.components.content
  (:require [stardew-tracker.state :as state]))

(defn content []
  [:main
   [:div.items
    (for [{:keys [id name source seasons skills]} (vals @state/items)]
      [:div.card {:key id}
       [:header.card-header
        [:p.card-header-title name]]
       [:div.card-content
        [:p source]
        [:button "test"]]
       [:div.card-footer
        ;; have to use for to iterate through the seasons vector
        (for [season seasons]
          [:span season])]
       [:div.card-footer
        ;; have to use for to iterate through the skills vector
        (for [skill skills]
          [:span skill])]])]])
