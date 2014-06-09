(defproject om-tut "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2227"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [om "0.5.0"]]

  :plugins [[lein-cljsbuild "1.0.3"]
            [com.cemerick/austin "0.1.3"]
            [cider/cider-nrepl "0.7.0-SNAPSHOT"]]

  :source-paths ["src"]

  :repl-options {:init-ns om-tut.core}

  :cljsbuild {:builds [{:source-paths ["src"]
                        :compiler {:output-to "om_tut.js"
                                   :optimizations :simple
                                   :prett-print true}}]})
