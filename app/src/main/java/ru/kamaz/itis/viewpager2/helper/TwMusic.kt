package ru.kamaz.itis.viewpager2.helper

import java.io.File

class TwMusic : TWUtil() {
    fun getPlayList(rootPath: String?): ArrayList<HashMap<String, String>>? {
        val fileList: ArrayList<HashMap<String, String>> = ArrayList()
        return try {
            val rootFolder = File(rootPath)
            val files =
                rootFolder.listFiles() //here you will get NPE if directory doesn't contains  any file,handle it like this.
            for (file in files) {
                if (file.isDirectory) {
                    if (getPlayList(file.absolutePath) != null) {
                        fileList.addAll(getPlayList(file.absolutePath)!!)
                    } else {
                        break
                    }
                } else if (file.name.endsWith(".mp3")) {
                    val song: HashMap<String, String> = HashMap()
                    song["file_path"] = file.absolutePath
                    song["file_name"] = file.name
                    fileList.add(song)
                }
            }
            fileList
        } catch (e: Exception) {
            null
        }
    }
}