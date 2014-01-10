;; -------------------------------------------------------------------
;; clj-fuzzy Phonetics API
;; -------------------------------------------------------------------
;;
;;
;;   Author: PLIQUE Guillaume (Yomguithereal)
;;   Version: 0.1
;;
(ns clj-fuzzy.phonetics
  (:require [clj-fuzzy.metaphone :only [process]]
            [clj-fuzzy.soundex :only [process]]
            [clj-fuzzy.nysiis :only [original]]))

(def metaphone clj-fuzzy.metaphone/process)
(def soundex clj-fuzzy.soundex/process)
(def nysiis clj-fuzzy.nysiis/original)
