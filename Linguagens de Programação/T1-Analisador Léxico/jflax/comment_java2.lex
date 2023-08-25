%%
%standalone

%%

"/*"  { System.out.println("Token: START_COMMENT"); }
"*/"  { System.out.println("Token: END_COMMENT"); }
.     { /* Ignorar outros caracteres */ }

