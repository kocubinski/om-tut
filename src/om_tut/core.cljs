(ns om-tut.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [clojure.browser.repl]))

(enable-console-print!)

(def app-state (atom {:list ["Lion" "Zebra" "Buffalo" "Antelope"]}))

(defn stripe [text bgc]
  (let [st #js {:backgroundColor bgc}]
    (dom/li #js {:style st} text)))

(defn run [elem-id]
  (om/root
   (fn [app owner]
     (apply dom/ul #js {:className "animals"}
            (map stripe (:list app) (cycle ["#ff0" "#fff"])
                 )))
   app-state
   {:target (. js/document (getElementById elem-id))}))

(run "app0")
