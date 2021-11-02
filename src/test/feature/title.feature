feature: title

  As a customer, I want to rent Batman to watch it.
  Scenario : Customer to rent Batman
  Given : That customer wants to rent "Batman"
  When : The title "Batman" is searched
  And : "Batman" is found
  Then : return "Film was found"

  As a new film has come out, I want to add it to the database
  Scenario : adding new Superman movie database
  Given : I want to add the new Superman film
  When : new superman film is added
  And : it is not already in the database
  Then : add new superman film

  The rating of Flash is now 4.9 points and needs to be updated
  Scenario : "Flash" rating needs to be updated
  Given : That there is a change in the "Flash" rating
  When : the rating has changed to 4.9
  And : the rating isn't already 4.9
  Then : change the "Flash" rating to 4.9

  The Wonder women is no longer available to be rented
  Scenario : "The Wonder Women" needs to be removed
  Given : "The Wonder Women" is not available to rent
  When : I delete the film from the database
  And : "The Wonder Women" is found in the database
  Then : return "The Wonder Women" has been deleted
