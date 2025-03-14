package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;




@Entity
@Table(name = "DEALS")
public class DealEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Integer idPipedrive;


@Column(columnDefinition="BIGINT", name="CREATOR_USER_ID")
public Long creatorUserId;
@Column(columnDefinition="BIGINT", name="USER_ID")
public Long userId;
@Column(columnDefinition="BIGINT", name="PERSON_ID")
public Long personId;
@Column(columnDefinition="BIGINT", name="ORG_ID")
public Long orgId;
@Column(columnDefinition="BIGINT", name="STAGE_ID")
public Long stageId;
@Column(columnDefinition="VARCHAR(255)", name="TITLE")
public String title;
@Column(columnDefinition="DOUBLE", name="VALUE")
public Double value;
@Column(columnDefinition="VARCHAR(255)", name="CURRENCY")
public String currency;
@Column(columnDefinition="DATETIME", name="ADD_TIME")
public LocalDateTime addTime;
@Column(columnDefinition="DATETIME", name="UPDATE_TIME")
public LocalDateTime updateTime;
@Column(columnDefinition="VARCHAR(255)", name="STATUS")
public String status;
@Column(columnDefinition="TEXT", name="PROBABILITY")
public String probability;
@Column(columnDefinition="VARCHAR(255)", name="LOST_REASON")
public String lostReason;
@Column(columnDefinition="VARCHAR(255)", name="VISIBLE_TO")
public String visibleTo;
@Column(columnDefinition="DATETIME", name="CLOSE_TIME")
public LocalDateTime closeTime;
@Column(columnDefinition="BIGINT", name="PIPELINE_ID")
public Long pipelineId;
@Column(columnDefinition="DATETIME", name="WON_TIME")
public LocalDateTime wonTime;
@Column(columnDefinition="DATETIME", name="LOST_TIME")
public LocalDateTime lostTime;
@Column(columnDefinition="DATE", name="EXPECTED_CLOSE_DATE")
public LocalDate expectedCloseDate;
@Column(columnDefinition="VARCHAR(255)", name="LABEL")
public String label;
@Column(columnDefinition="VARCHAR(255)", name="3883508EE2B24C7E32FFAB7A0495669094E8BDA7")
public String 3883508ee2b24c7e32ffab7a0495669094e8bda7;
@Column(columnDefinition="VARCHAR(255)", name="0B9D4472BAEC48899D2AC6862777D37401FF116B")
public String 0b9d4472baec48899d2ac6862777d37401ff116b;
@Column(columnDefinition="VARCHAR(255)", name="65D68FC7FD9580EC398278279AF739E81F46C69B")
public String 65d68fc7fd9580ec398278279af739e81f46c69b;
@Column(columnDefinition="VARCHAR(255)", name="63DCDAADD906301FB8D49583F076E60D6778E02B")
public String 63dcdaadd906301fb8d49583f076e60d6778e02b;
@Column(columnDefinition="VARCHAR(255)", name="D81269CEF9A27D5FE421990A5B25D1035E726278")
public String d81269cef9a27d5fe421990a5b25d1035e726278;
@Column(columnDefinition="VARCHAR(255)", name="447AE5B6E73C3AACC87873C7A2B0C6DB302B6772")
public String 447ae5b6e73c3aacc87873c7a2b0c6db302b6772;
@Column(columnDefinition="VARCHAR(255)", name="F9CB09A3D65029B77889DF2EC437A6EA2926D903")
public String f9cb09a3d65029b77889df2ec437a6ea2926d903;
@Column(columnDefinition="VARCHAR(255)", name="87E85A5534B18CFF61F906E173354C8B1069D4DF")
public String 87e85a5534b18cff61f906e173354c8b1069d4df;
@Column(columnDefinition="DATE", name="4EECB53CEB49F5B42D8F0916750909E3B11DC617")
public LocalDate 4eecb53ceb49f5b42d8f0916750909e3b11dc617;
@Column(columnDefinition="VARCHAR(255)", name="302B8516B5021DAB05BB0440DB68FE12F6EBBBF7")
public String 302b8516b5021dab05bb0440db68fe12f6ebbbf7;
@Column(columnDefinition="VARCHAR(255)", name="38E2819059967B6A5674A81FCCD3119A071220CE")
public String 38e2819059967b6a5674a81fccd3119a071220ce;
@Column(columnDefinition="BIGINT", name="2B79FD3EF8AEDED77FDDFADA47808D486D7AF456")
public Long 2b79fd3ef8aeded77fddfada47808d486d7af456;
@Column(columnDefinition="VARCHAR(255)", name="22465465F349D9902050838BED48CC481B8AAD33")
public String 22465465f349d9902050838bed48cc481b8aad33;
@Column(columnDefinition="VARCHAR(255)", name="465F1D50C1544DE7BDF7AD752D1F96353F15CFD1")
public String 465f1d50c1544de7bdf7ad752d1f96353f15cfd1;
@Column(columnDefinition="VARCHAR(255)", name="59D0AFCCC1F28F8F07D633822AE106EE01FB88C8")
public String 59d0afccc1f28f8f07d633822ae106ee01fb88c8;
@Column(columnDefinition="VARCHAR(255)", name="22491A17F6579D7759E03FDF6211DBC26C56F280")
public String 22491a17f6579d7759e03fdf6211dbc26c56f280;
@Column(columnDefinition="BIGINT", name="E03E32567FDE47B2B76F4B45EBFF2CF6ACCDC270")
public Long e03e32567fde47b2b76f4b45ebff2cf6accdc270;
@Column(columnDefinition="VARCHAR(255)", name="DA6DBBEE66A5DDF5EB03537A1120884F1E4624BC")
public String da6dbbee66a5ddf5eb03537a1120884f1e4624bc;
@Column(columnDefinition="VARCHAR(255)", name="B2D9D57FF766881C26EF19043E1ACFB7B90F1ACD")
public String b2d9d57ff766881c26ef19043e1acfb7b90f1acd;
@Column(columnDefinition="DATE", name="566658A615FB64EEFA4E30B05DC88B474D0437B7")
public LocalDate 566658a615fb64eefa4e30b05dc88b474d0437b7;
@Column(columnDefinition="VARCHAR(255)", name="477C1EE94C57BFEF11E8B1E749F4F1B1A288E3DF")
public String 477c1ee94c57bfef11e8b1e749f4f1b1a288e3df;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    


} //close class