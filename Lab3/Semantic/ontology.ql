has_child===parent


r([t("?x","has_spouse","?y")], 
[t("?y","has_spouse","?x")]).

----------- бесконечно
r([t("?x","has_spouse","?y"),t("?x","has_gender","male")], 
[t("?x","is_husband","?y")]).

r([t("?x","has_spouse","?y"),t("?x","has_gender","female")], 
[t("?x","is_wife","?y")]).
-----------

r([t("?x","has_child","?y")], 
[t("?y","has_parent","?x")]).

r([t("?x","has_gender","female"),t("?x","has_parent","?y")], 
[t("?x","is_daughter","?y")]).

r([t("?x","has_gender","male"),t("?x","has_parent","?y")], 
[t("?x","is_son","?y")]).

r([t("?x","has_child","?y"), t("?x","has_gender","female")], 
[t("?x","is_mother","?y")]).

r([t("?x","has_child","?y"), t("?x","has_gender","male")], 
[t("?x","is_father","?y")]).

//r([t("?z","has_child","?y"), t("?x","has_child","?z")], 
//[t("?x","is_grandparent","?y")]).

r([t("?x","has_child","?y"),t("?y","has_child","?z"),t("?y","differs","?z")], 
   [t("?x","is_grandparent","?z")]).

r([t("?x","has_gender","male"), t("?x","is_grandparent","?y")], 
[t("?x","is_grandpa","?y")]).

r([t("?x","has_gender","female"), t("?x","is_grandparent","?y")], 
[t("?x","is_grandma","?y")]).

r([t("?x","has_child","?y"), t("?y","has_child","?z"), t("?z","has_gender","male")], 
t("?z","is_grandchild","?x")] ).

r([t("?x","has_child","?y"),t("?x","has_child","?z"),t("?y","differs","?z")], 
[t("?y","is_sibling","?z")]).

r([t("?x","is_sibling","?y"),t("?x","has_gender","male")], 
[t("?y","is_brother","?z")]).

r([t("?x","is_sibling","?y"),t("?x","has_gender","female")], 
[t("?y","is_sister","?z")]).

r([t("?x","has a child","?y"),t("?y","has a child","?z"),t("?z","has a child","?w"),t("?y","differs","?z")], 
   [t("?x","is_grand_grandparent","?w")]).

------------- бесконечно
r([t("?y","has_spouse","?z"), t("?x","has_child","?z")], 
t("?x","is_parent_in_law","?y")]).

r([t("?z","has_spouse","?x"), t("?z","has_gender","male"), ("?y","has_child","?z")], 
t("?x","is_daughter_in_law","?y")]).

r([t("?z","has_spouse","?x"), t("?z","has_gender","female"), ("?y","has_child","?z")], 
t("?x","is_son_in_law","?y")]).

r([t("?y","has_spouse","?z"), t("?x","is_brother","?z")], 
t("?x","is_brother_in_law","?y")]).

r([t("?y","has_spouse","?z"), t("?x","is_sister","?z")], 
t("?x","is_sister_in_law","?y")]).
-------------
r([t("?z","has_child","?x"), t("?a","has_child","?x"), t("?z","has_child","?y"), n("?a","has_child","?y") ], 
t("?x","is_step_sibling","?y")]).

r([t("?x","has_child","?y"),t("?x","has_spouse","?z"), n("?z","has_child","?y")], [t("?z","is_step-parent","?y")]).


