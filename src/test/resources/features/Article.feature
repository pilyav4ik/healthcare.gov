Feature: Get article
  User needed get the list of Articles
  Scenario Template: Send request for getting articles
    Given get articles "<URL>" request
    Then response code is "<status>"
    Examples:
    |URL|status|
    |articles.json|200|
    |wrong.json|404|