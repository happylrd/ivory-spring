package io.happylrd.ivory.pojo

import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Student(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0,

        @Column(unique = true, length = 30, nullable = false, updatable = false)
        var username: String = "",

        @Column(length = 128, nullable = false)
        var password: String = "",

        @Column(length = 10)
        var realname: String = "",

        @Column(length = 11)
        var mobile: String = "",

        @Column(length = 20)
        var school: String = "",

        @Column(length = 30)
        var major: String = "",

        /**
         * Current constraint: `male` for 男生, `female` for 女生, `unknown` for 未知.
         * will be improved later.
         */
        @Column(length = 7)
        var gender: String = "unknown",

        var birthday: LocalDate = LocalDate.now(),

        var avatarUrl: String = "",

        var createTime: LocalDateTime = LocalDateTime.now(),

        var updateTime: LocalDateTime = LocalDateTime.now()
)