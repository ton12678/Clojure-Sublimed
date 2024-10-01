
; Constants
nil true false \c \tab 1 1.0 1/2 #inst "1985-01-25"

; Symbols
abc ab/cd _abc

; Keywords
:a :a.b/c.d ::ab ::a.b/c.d

; Strings
"" "abc" "\" \u221e \x"

; Regexps
#"re \n \uFFFF \p{L} \Qabc\E) \y"

; Top-level parens
() [] {} #() #{} #?() #?@() 

; Nested parens
(() [] {} #() #{} #?() #?@())
[() [] {} #() #{} #?() #?@()]
{() [] {} #() #{} #?() #?@()}
#{() [] {} #() #{} #?() #?@()}
#(() [] {} #() #{} #?() #?@())
([{}])
(((((((((()))))))))) [[[[[[[[[[]]]]]]]]]] {{{{{{{{{{}}}}}}}}}}

; Definitions
(def xyz)
(def xyz xyz)
(def xyz 123)
(def 123 xyz)
(def
  xyz)
(do (def xyz))

; Punctuation
,

; Meta
^{:s  sym
  :v  "str\n"
  :n  123
  :re #"\p{L}) \y"
  :l  ([{}])
  :q  '(abc)
  :sq `(abc ~def)
  :m  ^int i
  :d  @ref
  :v  #'var
  :c  #?(:clj)
  :df (def x 1)
  ; linecomment
  #_#_reader comment
  (comment form))))} sym

; Quotes
'{:symbols [name/space _ _abc]
  :strings ["str\n\x" '"str"]
  :regexp  #"\p{L}) \y"
  :number  123.456
  :keyword :key/word
  :parens  (() #() #?(:clj :cljs) [] {} #{})
  :quoted  ('abc `(x ~y))
  :meta    ^int i
  :vars    [@ref #'var]
  :defs    (def x 1)
  ; linecomment
  #_#_reader comment
  (comment form))))}

; Syntax quotes
`{:symbols [name/space _ _abc]
  :strings ["str\n\x" '"str"]
  :regexp  #"\p{L}) \y"
  :number  123.456
  :keyword :key/word
  :parens  (() #() #?(:clj :cljs) [] {} #{})
  :quoted  ('abc `(x ~y))
  :meta    ^int i
  :vars    [@ref #'var]
  :defs    (def x 1)
  ; linecomment
  #_#_reader comment
  (comment form))))}

`{:symbols [name/space _ _abc]
  :strings ["str\n\x" '"str"]
  :regexp  #"\p{L}) \y"
  :number  123.456
  :keyword :key/word
  :parens  (() #() #?(:clj :cljs) [] {} #{})
  :quoted  ('abc `(x ~y))
  :meta    ^int i
  :vars    [@ref #'var]
  :defs    (def x 1)
  ; linecomment
  #_#_reader comment
  (comment form))))}

`~{:symbols [name/space _ _abc]
   :strings ["str\n\x" '"str"]
   :regexp  #"\p{L}) \y"
   :number  123.456
   :keyword :key/word
   :parens  (() #() #?(:clj :cljs) [] {} #{})
   :quoted  ('abc `(x ~y))
   :meta    ^int i
   :vars    [@ref #'var]
   :defs    (def x 1)
   ; linecomment
   #_#_reader comment
   (comment form))))}

; Line comments
; {:symbols [name/space _ _abc]
;  :strings ["str\n\x" '"str"]
;  :regexp  #"\p{L}) \y"
;  :number  123.456
;  :keyword :key/word
;  :parens  (() #() #?(:clj :cljs) [] {} #{})
;  :quoted  ('abc `(x ~y))
;  :meta    ^int i
;  :vars    [@ref #'var]
;  :defs    (def x 1)
;  ; linecomment
;  #_#_reader comment
;  (comment form))))}

; Reader comments
#_{:symbols [name/space _ _abc]
   :strings ["str\n\x" '"str"]
   :regexp  #"\p{L}) \y"
   :number  123.456
   :keyword :key/word
   :parens  (() #() #?(:clj :cljs) [] {} #{})
   :quoted  ('abc `(x ~y))
   :meta    ^int i
   :vars    [@ref #'var]
   :defs    (def x 1)
   ; linecomment
   #_#_reader comment
   (comment form))))}

; Form comments
(comment
  {:symbols [name/space _ _abc]
   :strings ["str\n\x" '"str"]
   :regexp  #"\p{L}) \y"
   :number  123.456
   :keyword :key/word
   :parens  (() #() #?(:clj :cljs) [] {} #{})
   :quoted  ('abc `(x ~y))
   :meta    ^int i
   :vars    [@ref #'var]
   :defs    (def x 1)
   ; linecomment
   #_#_reader comment
   (comment form))))})
