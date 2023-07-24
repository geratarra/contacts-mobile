(ns contacts-mobile.routes 
  (:require [compojure.core :refer [defroutes GET]]
            [contacts-mobile.handlers :refer [contacts-handler]]
            [ring.util.response :refer [not-found redirect]]))

(defroutes app-routes
  (GET "/" request (redirect "/contacts"))
  (GET "/contacts" request contacts-handler)
  (not-found "Page not found"))