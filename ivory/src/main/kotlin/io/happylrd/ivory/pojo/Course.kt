package io.happylrd.ivory.pojo

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Course(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0,

        @Column(length = 30, nullable = false)
        var name: String = "",

        @Column(length = 128, nullable = false)
        var period: Int = 0,

        var createTime: LocalDateTime = LocalDateTime.now(),

        var updateTime: LocalDateTime = LocalDateTime.now()
)