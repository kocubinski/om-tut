(ns om-tut.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [clojure.browser.repl]))

(enable-console-print!)

(def app-state (atom {:text "Hello world!"}))

(defn run []
  (om/root
   (fn [app owner]
     (dom/h1 nil (:text app)))
   app-state
   {:target (. js/document (getElementById "app"))}))
