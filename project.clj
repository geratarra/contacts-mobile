(defproject contacts-mobile "0.1.0-SNAPSHOT"
  :description "Simple Contacts mobile application for Hyperview introduction"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring/ring-core "1.10.0"]
                 [hiccup "2.0.0-RC1"]
                 [ring-logger "1.1.1"]
                 [ring/ring-jetty-adapter "1.10.0"]
                 [compojure/compojure "1.7.0"]
                 [ring/ring-defaults "0.3.4"]]
  :main ^:skip-aot contacts-mobile.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}
             :dev {:main contacts-mobile.dev-server
                   :dependencies [[ring/ring-devel "1.6.3"]]}
             :prod {:main contacts-mobile.core}
             :provided {:dependencies [[ring/ring-devel "1.6.3"]]}})
