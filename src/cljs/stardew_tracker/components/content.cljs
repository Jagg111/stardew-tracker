(ns stardew-tracker.components.content
  (:require [stardew-tracker.state :as state]))

(defn content []
  ;; let get-bundle-name help us look up the name of a bundle given it's ID
  (let
    [get-bundle-name #(get-in @state/bundles [(get-in % [:bundle_id]) :name])
     ;;complete-bundle #(swap! state/progress conj :0 nil)
     ]

    [:main
     [:div.items
      ;; have to wrap in doall to help trigger re-renders
      ;; see https://github.com/reagent-project/reagent/issues/91
      (doall
        ;; loop through all the items in the items atom
        ;; NOTE - might be preferable to use doseq instead of for here
        ;; create an item card for each item
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
            ;; some checks to see if the current bundles id exists in the progress atom
            ;; this will eventually need to account for items that count towards multiple bundles
            (if (some #(= (get-in bundles [:id]) %) @state/progress )
              ;; true = that item is completed
              [:div
               [:a {:class "btn-small" :on-click #(swap! state/progress disj (get-in bundles [:id]))}
                ;; make a checked checkbox
                [:i {:class "material-icons left"} "check_box"]
                ;; put in the name of the bundle
                (get-bundle-name bundles)]]
              ;; false = this item is still needed for a bundle
              [:div
               [:a {:class "btn-small" :on-click #(swap! state/progress conj (get-in bundles [:id]))}
                ;; make a empty checkbox
                [:i {:class "material-icons left"} "check_box_outline_blank"]
                ;; put in the name of the bundle
                (get-bundle-name bundles)]
               ])]

           ;; what season item can be found in
           [:div {:class "card-content grey lighten-4"}

            ;; make a icon to show in front of the season names
            [:i {:class "material-icons"} "date_range"]

            ;; have to use for to iterate through the seasons vector
            ;; react needs a key since we are looping through, will just use the season name as the key
            ;; could use map here
            (for [season seasons]
              [:span.seasonTag {:key season} season])]

           ;; what skill the item can be acquired from
           [:div {:class "card-content grey lighten-4"}
            [:i {:class "material-icons"} "work"]
            ;; have to use for to iterate through the skills vector
            (for [skill skills]
              [:span {:key 1} skill])]
           ]
          )
        )
      ]
     ]
  )
)