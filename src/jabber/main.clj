(ns jabber.main
  (:gen-class)
  (:require [jabber.handler :refer [app]]
            [org.httpkit.server :refer [run-server]]))

(defn -main [& args]
  (run-server (app) {:port 8080})
  (println "Server started"))
