(ns stardew-tracker.components.header)

(defn header []
  [:div#header
   [:div#headerLeft
    [:h1 "Stardew Community Checklist"]]
   [:div#headerRight
    [:a.btn-small {:href "#"} "Export Data"
     [:i {:class "material-icons left"} "cloud_download"]]
    [:a.btn-small {:href "#"} "Import Data"
     [:i {:class "material-icons left"} "cloud_upload"]]]])