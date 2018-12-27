(ns stardew-tracker.components.content
  (:require [stardew-tracker.state :as state]))

(defn content []
  [:main
   [:div.items
    (for [{:keys [id name source seasons skills bundles]} (vals @state/items)]
      [:div {:key id :class "card"}

       ;; item card name
       [:div {:class "card-content z-depth-1"}
        [:div {:class "card-title"}
         [:p name]]]

       ;; item card source
       [:div.card-content
        [:p {:class "grey-text text-darken-1"} source]]

       ;; bundle tracker
       [:div.card-action
        ;; if the current items "bundles_id" is present in the progress atom
        ;; this will eventually need to account for items that count towards multiple bundles
        (if (contains? @state/progress (get-in bundles [:id]))
          ;; true = that item is completed
          [:div
           [:a {:class "btn-small"}
            [:i {:class "material-icons left"} "check_box"]
            "completed"]]
          ;; false = this is an open task
          [:div
           [:a {:class "btn-small"}
            [:i {:class "material-icons left"} "check_box_outline_blank"]
            "todo"]])
        ;; using the bundle_id on the item, create the key to look up the bundles name from the bundles atom
        [:span (get-in @state/bundles [(keyword (str "bundle_" (get-in bundles [:bundle_id]))) :name])]]

       ;; what season item can be found in
       [:div {:class "card-content grey lighten-4"}
        [:i {:class "material-icons"} "date_range"]
        ;; have to use for to iterate through the seasons vector
        (for [season seasons]
          [:span season])]

       ;; what skill the item can be acquired from
       [:div {:class "card-content grey lighten-4"}
        [:i {:class "material-icons"} "work"]
        ;; have to use for to iterate through the skills vector
        (for [skill skills]
          [:span skill])]
       ]
      )
    ]
   ]
  )
