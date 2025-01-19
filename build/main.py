from subprocess import Popen


def build_webhooks_app():
    p = Popen("build_webhooks.bat")
    stdout, stderr = p.communicate()
    if p.returncode !=0 :
        raise Exception("build_webhooks.bat failed")



def build_webhooks_docker_image():
    p = Popen("build_webhooks_docker_image.bat")
    stdout, stderr = p.communicate()



build_webhooks_app()
build_webhooks_docker_image()