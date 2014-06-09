(ns om-tut.core
  (:require [cemerick.austin.repls :refer (browser-connected-repl-js)]))

(defn cljs-browser-repl
  "Fire up a browser-connected ClojureScript REPL"
  []
  (let [repl-env (reset! cemerick.austin.repls/browser-repl-env
                         (cemerick.austin/repl-env))]
    (cemerick.austin.repls/cljs-repl repl-env)))
