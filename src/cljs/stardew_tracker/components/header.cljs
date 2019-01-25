(ns stardew-tracker.components.header)

(defn header []
  [:header
   [:div#header-wrapper.grid-x.grid-padding-x
    [:div#header-left.cell.auto
     [:h1 "Stardew Community Checklist"]]
    [:div#header-right.cell.shrink
     [:a {:href "#"}
      [:span [:i {:class "material-icons left"} "cloud_download"] "Export Data"]]
     [:a {:href "#"}
      [:span [:i {:class "material-icons left"} "cloud_upload"] "Import Data"]]]]])