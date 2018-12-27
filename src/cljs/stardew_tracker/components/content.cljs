(ns stardew-tracker.components.content
  (:require [stardew-tracker.state :as state]))

(defn content []
  [:main
   [:div.items
    (for [{:keys [id name source seasons skills bundles]} (vals @state/items)]
      [:div.card {:key id}
       [:header.card-header
        [:p.card-header-title name]]
       [:div.card-content
        [:p source]

        ;; if the current items "bundles_id" is present in the progress atom
        ;; this will eventually need to account for items that count towards
        ;; multiple bundles
        (if (contains? @state/progress (get-in bundles [:id]))
          ;; true = that item is completed
          [:button "completed"]
          ;; false = this is an open todo
          [:button "todo"])

        ]
       [:div.card-footer
        ;; have to use for to iterate through the seasons vector
        (for [season seasons]
          [:span season])]
       [:div.card-footer
        ;; have to use for to iterate through the skills vector
        (for [skill skills]
          [:span skill])]])]])
