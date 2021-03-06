import java.nio.file.Paths

String buildLog = new File("${basedir}/build.log").getText("UTF-8")
String composeFile = Paths.get("${basedir}/custom.yml").toString()

assert buildLog.contains("Running: docker-compose -f $composeFile up -d --no-color" as CharSequence)
assert buildLog.contains("Running: docker-compose -f $composeFile down" as CharSequence)
