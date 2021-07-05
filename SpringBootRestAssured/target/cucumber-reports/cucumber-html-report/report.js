$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/UpdatePet/putpet.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I want to update pet details",
  "description": "",
  "id": "as-a-user-i-want-to-update-pet-details",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Pet is created first",
  "description": "",
  "id": "as-a-user-i-want-to-update-pet-details;pet-is-created-first",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 3,
      "value": "#Create Pet"
    }
  ],
  "line": 4,
  "name": "Create Pet entry that should be added to store with following attributes",
  "rows": [
    {
      "cells": [
        "category",
        "\u003ccategory\u003e"
      ],
      "line": 5
    },
    {
      "cells": [
        "name",
        "\u003cname\u003e"
      ],
      "line": 6
    },
    {
      "cells": [
        "status",
        "\u003cstatus\u003e"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Prepare POST request for creating new Pet",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "POST request is sent to create Pet endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "\"\u003cresponseCode\u003e\" should be returned",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#Update Pet"
    }
  ],
  "line": 13,
  "name": "pet entry is created with updated details",
  "rows": [
    {
      "cells": [
        "updatedname",
        "\u003cupdatedname\u003e"
      ],
      "line": 14
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Prepare PUT request for creating new Pet",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "PUT request is sent to create Pet endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Details should be update successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "\"\u003cresponseCode\u003e\" should be returned",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-to-update-pet-details;pet-is-created-first;",
  "rows": [
    {
      "cells": [
        "updatedname",
        "responseCode",
        "category",
        "name",
        "status"
      ],
      "line": 20,
      "id": "as-a-user-i-want-to-update-pet-details;pet-is-created-first;;1"
    },
    {
      "cells": [
        "Kuroku",
        "200",
        "Domestic",
        "jackie",
        "available"
      ],
      "line": 21,
      "id": "as-a-user-i-want-to-update-pet-details;pet-is-created-first;;2"
    },
    {
      "cells": [
        "Kuroku Number 2",
        "200",
        "International",
        "doggu",
        "available"
      ],
      "line": 22,
      "id": "as-a-user-i-want-to-update-pet-details;pet-is-created-first;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Pet is created first",
  "description": "",
  "id": "as-a-user-i-want-to-update-pet-details;pet-is-created-first;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 3,
      "value": "#Create Pet"
    }
  ],
  "line": 4,
  "name": "Create Pet entry that should be added to store with following attributes",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "rows": [
    {
      "cells": [
        "category",
        "Domestic"
      ],
      "line": 5
    },
    {
      "cells": [
        "name",
        "jackie"
      ],
      "line": 6
    },
    {
      "cells": [
        "status",
        "available"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Prepare POST request for creating new Pet",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "POST request is sent to create Pet endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "\"200\" should be returned",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#Update Pet"
    }
  ],
  "line": 13,
  "name": "pet entry is created with updated details",
  "matchedColumns": [
    0
  ],
  "rows": [
    {
      "cells": [
        "updatedname",
        "Kuroku"
      ],
      "line": 14
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Prepare PUT request for creating new Pet",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "PUT request is sent to create Pet endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Details should be update successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "\"200\" should be returned",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinationPet.create_Pet_entry_that_should_be_added_to_store_with_following_attributes(DataTable)"
});
formatter.result({
  "duration": 156540300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationPet.prepare_POST_request_for_creating_new_Pet()"
});
formatter.result({
  "duration": 418894000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationPet.post_request_is_sent_to_create_Pet_endpoint()"
});
formatter.result({
  "duration": 3848055200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 1
    }
  ],
  "location": "stepDefinationCommon.shouldBeReturned(String)"
});
formatter.result({
  "duration": 7893500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationPutPet.pet_entry_is_created_with_updated_details(DataTable)"
});
formatter.result({
  "duration": 9087800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationPutPet.prepare_PUT_request_for_creating_new_Pet()"
});
formatter.result({
  "duration": 1271000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationPutPet.put_request_is_sent_to_create_Pet_endpoint()"
});
formatter.result({
  "duration": 1645408200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationPutPet.details_should_be_update_successfully()"
});
formatter.result({
  "duration": 568452400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 1
    }
  ],
  "location": "stepDefinationCommon.shouldBeReturned(String)"
});
formatter.result({
  "duration": 183800,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Pet is created first",
  "description": "",
  "id": "as-a-user-i-want-to-update-pet-details;pet-is-created-first;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 3,
      "value": "#Create Pet"
    }
  ],
  "line": 4,
  "name": "Create Pet entry that should be added to store with following attributes",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "rows": [
    {
      "cells": [
        "category",
        "International"
      ],
      "line": 5
    },
    {
      "cells": [
        "name",
        "doggu"
      ],
      "line": 6
    },
    {
      "cells": [
        "status",
        "available"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Prepare POST request for creating new Pet",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "POST request is sent to create Pet endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "\"200\" should be returned",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#Update Pet"
    }
  ],
  "line": 13,
  "name": "pet entry is created with updated details",
  "matchedColumns": [
    0
  ],
  "rows": [
    {
      "cells": [
        "updatedname",
        "Kuroku Number 2"
      ],
      "line": 14
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Prepare PUT request for creating new Pet",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "PUT request is sent to create Pet endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Details should be update successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "\"200\" should be returned",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinationPet.create_Pet_entry_that_should_be_added_to_store_with_following_attributes(DataTable)"
});
formatter.result({
  "duration": 610800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationPet.prepare_POST_request_for_creating_new_Pet()"
});
formatter.result({
  "duration": 705000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationPet.post_request_is_sent_to_create_Pet_endpoint()"
});
formatter.result({
  "duration": 1552696200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 1
    }
  ],
  "location": "stepDefinationCommon.shouldBeReturned(String)"
});
formatter.result({
  "duration": 753900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationPutPet.pet_entry_is_created_with_updated_details(DataTable)"
});
formatter.result({
  "duration": 1381800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationPutPet.prepare_PUT_request_for_creating_new_Pet()"
});
formatter.result({
  "duration": 2404600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationPutPet.put_request_is_sent_to_create_Pet_endpoint()"
});
formatter.result({
  "duration": 1510801700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationPutPet.details_should_be_update_successfully()"
});
formatter.result({
  "duration": 16502700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 1
    }
  ],
  "location": "stepDefinationCommon.shouldBeReturned(String)"
});
formatter.result({
  "duration": 145100,
  "status": "passed"
});
});