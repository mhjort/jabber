(defproject jabber "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [http-kit "2.1.18"]
                 [compojure "1.4.0"]
                 [ring/ring-core "1.4.0"]
                 [ring/ring-defaults "0.1.5"]
                 [org.clojure/tools.trace "0.7.8"]
                 [cheshire "5.5.0"]]
  :profiles {:dev
             {:dependencies [[ring/ring-mock "0.3.0"]
                             [clj-containment-matchers "1.0.1"]]}}
  :aot [jabber.main]
  :main jabber.main)
