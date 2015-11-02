(ns jabber.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults api-defaults]]))

(defroutes app-routes
  (GET "/health" [] "ok")
  (route/not-found "Not Found"))

(defn app []
  (-> app-routes
      (wrap-defaults api-defaults)))
