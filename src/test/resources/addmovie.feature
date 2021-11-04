Feature: add movie

  As the database manager, I want to add a new film upon release so that database is always up to date for the customers
  Scenario 1: If the database manager checks and approves to addition of the new title, they should be able to add a new film
    Given that there are no duplicates
    When I add the title to the database
    Then the film will be added as well as all it's information

#  Scenario 2: If there is a duplicate present, the website shall return an error message stating "the new film cannot be installed as there is a duplicate"
#    Given that there is a duplicate film
#    When I add the film to the database
#    Then the film title will not be installed and I should be told "the new film cannot be installed as there is a duplicate"
