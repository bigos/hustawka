(ns seesaw-sample
  (:require [seesaw.core :as sc]))

(let [f (sc/frame :content (sc/label :text "Hello World!"))]
  (sc/pack! f)
  (sc/show! f))
