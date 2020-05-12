package com.epam.edp.customStages.impl.ci.impl.sonar

import com.epam.edp.stages.impl.ci.ProjectType
import com.epam.edp.stages.impl.ci.Stage

@Stage(name = "sonar", buildTool = ["maven"], type = [ProjectType.APPLICATION, ProjectType.AUTOTESTS, ProjectType.LIBRARY])
class CustomSonar {
    Script script
    void run(context) {
        script.sh "echo 'Your custom logic of the stage'"
    }
}
return CustomSonar
