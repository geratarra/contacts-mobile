(ns contacts-mobile.dev-server
  (:require [contacts-mobile.configs :refer [listening-port]]
            [contacts-mobile.routes :refer [app-routes]]
            [ring.adapter.jetty :refer [run-jetty]]
            [ring.logger :refer [wrap-with-logger]]
            [ring.middleware.defaults :refer [site-defaults wrap-defaults]]
            [ring.middleware.params :refer [wrap-params]]
            [ring.middleware.reload :refer [wrap-reload]])
  (:gen-class))

(defn -main [& args]
  (println (str "Server started (dev mode) at port " listening-port))
  (run-jetty (-> app-routes
                 wrap-params
                 wrap-reload
                 (wrap-defaults site-defaults)
                 wrap-with-logger)
             {:port listening-port
              :join? false}))