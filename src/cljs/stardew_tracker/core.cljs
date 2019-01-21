(ns stardew-tracker.core
  (:require [reagent.core :as reagent :refer [atom]]
            [stardew-tracker.components.content :refer [content]]
            [stardew-tracker.components.header :refer [header]]))

(enable-console-print!)

(defn app []
  [:div#site-wrapper
   [header]
   [content]])

(defn render []
  (reagent/render [app] (js/document.getElementById "app")))
