## @SessionAttributes("tacoOrder")
- This is important when data need be carried in the session so that it can span multiple requests

## @ModelAttribute
-  @ModelAttribute binds the object on which it is used with the name specified to session holding the data pre-populated
- @ModelAttribute(name ="taco") Taco taco  binds to taco
- @ModelAttribute(name ="boom") Taco taco  binds to boom

## View Controllers
- replace simple get controllers not processing or populating any data via model  



## cassandra
requires a keyspace within which the repositories will operate

exec in