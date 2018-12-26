(ns stardew-tracker.core
  (:require [reagent.core :as reagent :refer [atom]]
            [stardew-tracker.components.content :refer [content]]))

(enable-console-print!)

(defn app []
  [:div.container
   [content]])

(defn render []
  (reagent/render [app] (js/document.getElementById "app")))
