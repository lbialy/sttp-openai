package sttp.openai.fixtures

object ModerationsFixture {

  val jsonCreateModerationResponse = """{
                                       |  "id": "modr-5MWoLO",
                                       |  "model": "text-moderation-stable",
                                       |  "results": [
                                       |    {
                                       |      "categories": {
                                       |        "hate": false,
                                       |        "hate/threatening": true,
                                       |        "self-harm": false,
                                       |        "sexual": false,
                                       |        "sexual/minors": false,
                                       |        "violence": true,
                                       |        "violence/graphic": false
                                       |      },
                                       |      "category_scores": {
                                       |        "hate": 0.22714105248451233,
                                       |        "hate/threatening": 0.4132447838783264,
                                       |        "self-harm": 0.005232391878962517,
                                       |        "sexual": 0.01407341007143259,
                                       |        "sexual/minors": 0.0038522258400917053,
                                       |        "violence": 0.9223177433013916,
                                       |        "violence/graphic": 0.036865197122097015
                                       |      },
                                       |      "flagged": true
                                       |    }
                                       |  ]
                                       |}
                                       |""".stripMargin

  val jsonCreateModerationResponseUnknownModel = """{
                                       |  "id": "modr-5MWoL1",
                                       |  "model": "text-moderation-007",
                                       |  "results": [
                                       |    {
                                       |      "categories": {
                                       |        "hate": false,
                                       |        "hate/threatening": true,
                                       |        "self-harm": false,
                                       |        "sexual": false,
                                       |        "sexual/minors": false,
                                       |        "violence": true,
                                       |        "violence/graphic": false
                                       |      },
                                       |      "category_scores": {
                                       |        "hate": 0.22714105248451233,
                                       |        "hate/threatening": 0.4132447838783264,
                                       |        "self-harm": 0.005232391878962517,
                                       |        "sexual": 0.01407341007143259,
                                       |        "sexual/minors": 0.0038522258400917053,
                                       |        "violence": 0.9223177433013916,
                                       |        "violence/graphic": 0.036865197122097015
                                       |      },
                                       |      "flagged": true
                                       |    }
                                       |  ]
                                       |}
                                       |""".stripMargin
}
