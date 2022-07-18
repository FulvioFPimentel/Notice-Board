import { StyleSheet, Dimensions } from 'react-native';

const deviceWidth = Dimensions.get("window").width;
const deviceHeight = Dimensions.get("window").height;


const colors = {
    lightGray: "#E1E1E1",
    mediumGray: "#7D7D7D",
    darkGray: "#4B4B4B",
    yellow:"#FFB800",
    orange: "#FFAB6D",
    red: "#F73737",
    white:"#FFFFFF",
    black: "#1A1A1A",
    darkBlue: "#3A4B64",
    bodyGray: "#EAEAEA",
    cardLight: "#808080",
    cardDark: "#545454"
};

const fontsFamilyType = {
    fontRegular: 'sans-serif',
    fontMedium: 'sans-serif-medium',
    fontLight: 'sans-serif-light',
    fontThin: 'sans-serif-thin',
}

const theme = StyleSheet.create({
    container: {
        flex: 1,
        width: deviceWidth,
        height: deviceHeight,
        backgroundColor: colors.bodyGray,
    },

    card: {
        justifyContent: "center",
        alignItems: "center",
        width: "100%",
        height: "100%",
        backgroundColor: colors.white,
        borderRadius: 8,
        shadowColor: colors.black,
        shadowOffset: {
            width: 1,
            height: 4,
        },
        shadowOpacity: 0.25,
        shadowRadius: 3.84,
    },

    noticeContainer: {
        width: "95%",
        backgroundColor: colors.white,
        borderRadius: 8,
        shadowColor: colors.black,
        shadowOffset: {
            width: 1,
            height: 4,
        },
        shadowOpacity: 0.25,
        shadowRadius: 3.84,

        padding: 15,
        marginHorizontal: 10,
        marginTop: 11,
        alignItems: "flex-end",
    },

    meetingsContainer: {
        width: "95%",
        backgroundColor: colors.white,
        borderRadius: 8,
        shadowColor: colors.black,
        shadowOffset: {
            width: 1,
            height: 4,
        },
        shadowOpacity: 0.25,
        shadowRadius: 3.84,

        padding: 15,
        marginHorizontal: 10,
        marginTop: 11,
        alignItems: "flex-start",
    },
    
});

const nav = StyleSheet.create({
    leftText:{
        color: colors.lightGray,
        fontSize: 20,
        fontFamily: fontsFamilyType.fontRegular,
        fontStyle: "normal",
        marginLeft: 5,
    },

    textOption:{
        color: colors.lightGray,
        fontSize: 16,
        fontFamily: fontsFamilyType.fontRegular,
        fontStyle: "normal",
        marginLeft: 5,
    },

    textActive: {
        fontWeight: "bold",
        color: colors.mediumGray
    },

    drawer: {

    },

    options: {
        width: deviceWidth,
        height: 140,
        backgroundColor: colors.darkBlue,
        marginTop: 5,
        marginRight: -20,
        padding: 20,
        justifyContent: "space-between",
    },

    option: {
        paddingVertical: 5,
    }
})

const text = StyleSheet.create({

    noticeDate: {
        marginBottom: 12,
        fontFamily: fontsFamilyType.fontRegular,
        fontWeight: "bold",
    },

    noticeTitle: {
        width: "100%",
        fontFamily: fontsFamilyType.fontRegular,
        fontWeight: "bold",
        fontSize: 16,
        marginBottom: 10
    },

    noticeNews: {
        width: "100%",
        fontFamily: fontsFamilyType.fontRegular,
        marginBottom: 10,
        fontSize: 14,
    }
})

export { colors, theme, nav, text }